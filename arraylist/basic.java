ArrayList<Integer> list = new ArrayList<>();

list.add(10);                    // add
list.add(1, 50);                 // add at index

list.get(0);                     // access

list.set(0, 100);                // update

list.remove(0);                 // remove index
list.remove(Integer.valueOf(10)); // remove value

list.size();                     // size

list.contains(20);               // exists?

list.indexOf(20);                // first index
list.lastIndexOf(20);            // last index

list.isEmpty();                  // empty?

list.clear();                    // remove everything

Collections.sort(list);          // ascending
Collections.sort(list, Collections.reverseOrder()); // descending

Collections.reverse(list);       // reverse
Collections.max(list);           // maximum
Collections.min(list);           // minimum
