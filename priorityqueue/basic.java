// Min Heap
PriorityQueue<Integer> pq = new PriorityQueue<>();

// Max Heap
PriorityQueue<Integer> pq =
    new PriorityQueue<>(Collections.reverseOrder());

// Add
pq.offer(x);

// Top
pq.peek();

// Remove top
pq.poll();
