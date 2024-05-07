/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
z=(s)=>s.filter((x)=>x!='('&&x!=')'&&x!=' ')
s1 = z(readline().split(''))
s2 = z(readline().split(''))

s1=s1.map(w=> +w)
s2=s2.map(w=> +w)
// e=f=g=h=
// Write an answer using console.log()
// To debug: console.error('Debug messages...');

console.log(``);
console.log(`()`);



//bots

// const s1 = readline();
// const s2 = readline();

// // Extract matrix values from input strings
// const [a, b, e, f] = s1.match(/-?\d+/g).map(Number); /** this is where i can learn */
// const [c, d, g, h] = s2.match(/-?\d+/g).map(Number);

// // Check if numbers are within constraints
// if (
//     a < -150000 || a > 150000 ||
//     b < -150000 || b > 150000 ||
//     c < -150000 || c > 150000 ||
//     d < -150000 || d > 150000 ||
//     e < -150000 || e > 150000 ||
//     f < -150000 || f > 150000 ||
//     g < -150000 || g > 150000 ||
//     h < -150000 || h > 150000
// ) {
//     console.log('Numbers must be between -150000 and 150000');
// } else {
//     // Calculate matrix product
//     const p1 = a * e + b * g;
//     const p2 = a * f + b * h;
//     const p3 = c * e + d * g;
//     const p4 = c * f + d * h;

//     // Output result
//     console.log(`(${p1} ${p2})`);
//     console.log(`(${p3} ${p4})`);
// }



// 10 am "spell" check
// f=i=>i.replace(/\./g,'').split` `
// a=f("I am not a good speller. Sometimes I mix up the spelling of words and sometimes I even forget to put periods. Please count the number of words I have misspelled and the number of periods I have missed.")
// s=readline(m=0)
// for(i=0;a[i];i++)m+=a[i]!=f(s)[i]
// print(m,4-s.split`.`.length)
