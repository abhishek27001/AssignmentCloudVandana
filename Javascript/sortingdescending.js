const numbers = [5, 2, 9, 1, 4, 6];

// Sort the array in descending order
numbers.sort(function(a, b) {
  return b - a;
});

console.log("Sorted array in descending order:", numbers);
