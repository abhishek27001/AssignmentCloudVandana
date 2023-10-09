function reverseWords(sentence) {
  // Split the sentence into words using space as a delimiter
  const words = sentence.split(" ");

  // Create an array to store reversed words
  const reversedWords = [];

  // Iterate through each word, reverse it, and push it to the reversedWords array
  for (const word of words) {
    const reversedWord = word.split("").reverse().join("");
    reversedWords.push(reversedWord);
  }

  // Join the reversed words to form the reversed sentence
  const reversedSentence = reversedWords.join(" ");

  return reversedSentence;
}

// Take input from the user
const inputSentence = prompt("Enter a sentence:");

if (inputSentence) {
  const reversedSentence = reverseWords(inputSentence);
  console.log("Reversed sentence:", reversedSentence);
} else {
  console.log("No input provided.");
}
