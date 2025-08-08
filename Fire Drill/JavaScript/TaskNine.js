let squareResult = 0;
let overAllSum = 0;
let multiply = 1;
let sum = 0;
for (let count = 4; count < 8; count+=4) {	
	for (let counter = 1; counter <= 5; counter ++) {
	multiply *= count;
	sum += multiply;
		}
}
for (let space = 1; space < 2; space ++) {
		console.log(" ");
		}
let total = 1;
let sumNumber = 0;
for (let index = 8; index < 16; index+= 8) {
	for (let counter = 1; counter <=5; counter ++) {
	total *= index
	sumNumber +=total
			}
		}
overAllSum = sum + sumNumber;
squareResult = overAllSum * overAllSum;
console.log(squareResult);
