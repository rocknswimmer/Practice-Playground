 **/

const base = parseInt(readline());
const digits = readline();
const number = readline();

// Write an answer using console.log()
// To debug: console.error('Debug messages...');

const recursiveBackCheck = (number) => {
    let lastDigit = number[number.length - 1]
    if( lastDigit === digits[Number(base - 1)]){
        //recursion
        if(number.length > 1){
           let previous = recursiveBackCheck(number.substring(0, number.length - 1))
           return previous + digits[0];
        } else {
            return digits[1] + digits[0]//
        }

    } else {
        let index = digits.indexOf(lastDigit);
        return number.substring(0, number.length - 1) + digits[index + 1]
    }
}

console.log('successor');// add function call here, but timed out


//missed edge case no number

/**
 only one to finish

 import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

base = int(input())
digits = input()
number = input()

def plus_one(number):
    if number == "":
        return digits[1]
    elif number[-1] == digits[-1]:
        return plus_one(number[:-1]) + digits[0]
    else:
        return number[:-1] + digits[digits.find(number[-1])+1]

# Write an answer using print
# To debug: print("Debug messages...", file=sys.stderr, flush=True)

print(plus_one(number))

 */