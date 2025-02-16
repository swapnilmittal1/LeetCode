public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();

        for(String s : strs) {
            str.append(s.replace("/","//")).append("/:");
            
        }

        return str.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> ans = new ArrayList<>();

        StringBuilder curr = new StringBuilder();

        int i = 0;

        while(i < s.length()) {
            if(i + 1 < s.length() && s.charAt(i) == '/' && s.charAt(i + 1)==':') {
                ans.add(curr.toString());
                curr = new StringBuilder();
                i = i + 2;
            } else if(i + 1 < s.length() && s.charAt(i) == '/' && s.charAt(i + 1) == '/') {
                curr.append('/');
                i += 2;
            } else {
                curr.append(s.charAt(i));
                i++;
            }
        } 

        return ans;

        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));