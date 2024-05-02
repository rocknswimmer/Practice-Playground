/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
const strengths = [];
let minDif = -1;

const N = parseInt(readline());
for (let i = 0; i < N; i++) {

    const pi = parseInt(readline());
    strengths.push(pi)
    // trying to think of none brute force way since thats a lot of checking
    //console.error(strengths, pi)
    // if(strengths[0] === undefined){
    //     strengths[0] = pi;
    // } else if (strengths[1] === undefined){
    //     if(pi > strengths[0]){
    //         strengths[1] = strengths[0];
    //         strengths[0] = pi;
    //     } else {
    //        strengths[1] = pi;
    //     }

    // } else if(Math.abs(pi - strengths[0]) < Math.abs(strengths[0] - strengths[1])){

    //         strengths[1] = pi;
    //     } else if(Math.abs(pi - strengths[1]) < Math.abs(strengths[0] - strengths[1])) {
    //         strengths[0] = pi;
    //     }

}
//stolen merge sort

function MinimumDifference(arr, n) {
    if (n < 2)
          return Number.MAX_SAFE_INTEGER;
    var mid = Math.floor(n / 2);
    var left = arr.slice(0, mid);
    var right = arr.slice(mid);

    var ls = MinimumDifference(left, mid);
    var rs = MinimumDifference(right, n - mid);
    var mg = mergeHelper(left, right, arr, mid, n - mid);

    return Math.min(mg, Math.min(ls, rs));
  }

// Helper function for merge sort
function mergeHelper(left, right, arr, n1, n2) {
      var i = 0;
      var j = 0;
      var k = 0;
      var minDiff = Number.MAX_SAFE_INTEGER;

    while (i < n1 && j < n2) {
          if (left[i] <= right[j]) {
            minDiff = Math.min(minDiff, right[j] - left[i]);
            arr[k] = left[i];
            i++;
          }
        else {
            minDiff = Math.min(minDiff, left[i] - right[j]);
            arr[k] = right[j];
            j++;
          }
          k++;
    }

    while (i < n1) {
          arr[k] = left[i];
          i++;
          k++;
    }
    while (j < n2) {
          arr[k] = right[j];
          j++;
          k++;
    }

    return minDiff;
  }



//not optimal


// let ind = 0;
// let roaming = 1;
// while(minDif !== 0 && ind < N - 1){
//     if(minDif === -1){
//         minDif = Math.abs(strengths[0] - strengths[1]);
//     } else{
//         roaming = ind + 1;
//         while(minDif !== 0 && roaming < N){
//             if(minDif > Math.abs(strengths[ind] - strengths[roaming])){
//                 minDif = Math.abs(strengths[ind] - strengths[roaming]);
//             }
//             roaming++
//         }

//     }
//     ind++
// }

// Write an answer using console.log()
// To debug: console.error('Debug messages...');
//console.error(strengths)
console.log(MinimumDifference(strengths, N));
