var inputs = readline().split(' ');
const topNumber = parseInt(inputs[0]);
const bottomNumber = parseInt(inputs[1]);

// Write an answer using console.log()
// To debug: console.error('Debug messages...');
let spacer = '+---+'
let b = '|   |'
let sM = '| * |'
let sL = '|*  |'
let sR = '|  *|'
let d = '|* *|'
let store = [[b, b, b], [b,sM,b],[sL,b,sR],[sL,sM,sR],[d,b,d], [d,sM,d], [d,d,d]]

console.log(spacer);

for(let i = 0; i < 3; i++){
    console.log(store[topNumber][i])
}


console.log(spacer);

for(let i = 0; i < 3; i++){
    console.log(store[bottomNumber][i])
}

console.log(spacer);
