class Solution {
    class Transaction{
        String name;
        int time;
        int amount;
        String city;
        String original;
        int index;
        public Transaction(String string, int idx){
            String[] arr = string.split(",");
            name = arr[0];
            time = Integer.parseInt(arr[1]);
            amount = Integer.parseInt(arr[2]);
            city = arr[3];
            original = string;
            index = idx;
        }
    }

    public List<String> invalidTransactions(String[] transactions) {
        int n = transactions.length;
        Transaction[] trans = new Transaction[n];
        for (int i = 0; i < n; i++) {
            trans[i] = new Transaction(transactions[i], i);
        }

        boolean[] invalid = new boolean[n];

        // Check for amount exceeding 1000
        for (int i = 0; i < n; i++) {
            if (trans[i].amount > 1000) {
                invalid[i] = true;
            }
        }

        // Group transactions by name
        Map<String, List<Transaction>> nameToTrans = new HashMap<>();
        for (Transaction t : trans) {
            nameToTrans.computeIfAbsent(t.name, k -> new ArrayList<>()).add(t);
        }

        // Check for invalid transactions based on time and city
        for (List<Transaction> list : nameToTrans.values()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Transaction t1 = list.get(i);
                for (int j = 0; j < size; j++) {
                    if (i == j) continue;
                    Transaction t2 = list.get(j);
                    if (Math.abs(t1.time - t2.time) <= 60 && !t1.city.equals(t2.city)) {
                        invalid[t1.index] = true;
                        invalid[t2.index] = true;
                    }
                }
            }
        }

        // Collect invalid transactions
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (invalid[i]) {
                result.add(trans[i].original);
            }
        }

        return result;
    }
}
