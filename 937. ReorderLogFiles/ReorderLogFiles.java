import java.util.*;

public class ReorderLogFiles {
	public String[] reorderLogFiles(String[] logs) {
	    List<String> letterLogs = new ArrayList<>();
	    List<String> digitLogs = new ArrayList<>();	

          for (String log: logs) {
		String[] parts = log.split(" ", 2);
		if(Character.isLetter(parts[1].charAt(0))) {
		   letterLogs.add(log);
		}else{
		   digitLogs.add(log);
		}}

	    letterLogs.sort(new Comparator<String>() {
           @Override
           public int compare(String a, String b) {
             String[] aParts = a.split(" ", 2);
             String[] bParts = b.split(" ", 2);
             int contentCompare = aParts[1].compareTo(bParts[1]);
             if (contentCompare != 0) {
                return contentCompare;
             } else {
                return aParts[0].compareTo(bParts[0]);
             }
            }});

	     List<String> result = new ArrayList<>();
           result.addAll(letterLogs);
           result.addAll(digitLogs);
        
        return result.toArray(new String[0]);

	}

	public static void main(String[] args) {
        ReorderLogFiles solution = new ReorderLogFiles();
        String[] logs = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        String[] reorderedLogs = solution.reorderLogFiles(logs);
        for (String log : reorderedLogs) {
            System.out.println(log);
        }
    }

}
