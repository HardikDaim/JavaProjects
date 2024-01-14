package Hashing;
import java.util.HashMap;
import java.util.LinkedList;

public class HashMapCode {
    static class Hashing<K, V> { // Generics
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // no. of Nodes
        private int N; // no.of Buckets/size of Array
        private LinkedList<Node> buckets[];

        // Constructor
        public Hashing() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N; // Make negative to positive and % by N for 0 to N-1
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) {
                    return i;
                }
            }
            return -1;
        }

        private void reHash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];
            for (int i = 0; i < N * 2; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1) {
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                // Rehashing
                reHash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            return di != -1;
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1) {
                return null;
            } else {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di == -1) {
                return null;
            } else {
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }
    }

    public static void main(String[] args) {
        Hashing<String, Integer> map = new Hashing<>();
        map.put("India", 200);
        map.put("China", 250);
        map.put("USA", 100);
        
        System.out.println("India population: " + map.get("India"));
        System.out.println("China population: " + map.get("China"));
        System.out.println("USA population: " + map.get("USA"));
        
        System.out.println("Removing China...");
        map.remove("China");
        
        System.out.println("Does map contain China? " + map.containsKey("China"));
    }
}
