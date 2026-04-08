class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to store sorted word -> list of anagrams
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            // Convert word to char array
            char[] chars = word.toCharArray();

            // Sort characters
            Arrays.sort(chars);

            // Convert back to string
            String sortedWord = new String(chars);

            // If key not present, add new list
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            // Add word to the list
            map.get(sortedWord).add(word);
        }

        // Return all grouped values
        return new ArrayList<>(map.values());
    }
}
