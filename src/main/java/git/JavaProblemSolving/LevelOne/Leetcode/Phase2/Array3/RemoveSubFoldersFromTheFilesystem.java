package git.JavaProblemSolving.LevelOne.Leetcode.Phase2.Array3;

import java.util.*;

class MutableBoolean {
    public boolean value = false;
}

record Holder(Set<String> set, MutableBoolean isFolderArr) {

}

class RemoveSubFoldersFromTheFilesystem {
    HashMap<String, Holder> map;

    void addToHashMp(String[] dir) {
        dir[0] = "/" + 0;
        for (int i = 1; i < dir.length; i++) {
            dir[i] = dir[i] + i;
            map.putIfAbsent(dir[i], new Holder(new HashSet<>(), new MutableBoolean()));
            map.get(dir[i - 1]).set().add(dir[i]);
        }
        map.get(dir[dir.length - 1]).isFolderArr().value = true;
    }

    boolean traceDir(String[] dir) {
        dir[0] = "/" + 0;
        for (int i = 1; i < dir.length - 1; i++) {
            dir[i] = dir[i] + i;
            if (map.get(dir[i]).isFolderArr().value) {
                return true;
            }
        }
        return false;
    }

    public List<String> removeSubfolders(String[] folder) {
//        Arrays.sort(folder, (a, b) -> {
//            return Integer.compare(a.length(), b.length());
//        });
        map = new HashMap<>();
        map.put("/" + 0, new Holder(new HashSet<>(), new MutableBoolean()));

        for (String str : folder) {
            var tmpArr = str.split("/");
            addToHashMp(tmpArr);
        }
        List<String> result = new ArrayList<>();
        for (String str : folder) {
            if (!traceDir(str.split("/"))) {
                result.add(str);
            }
        }
        return result;
    }

}