/*
Constraints:
placed at back of line
pool limits that fit




*/

const sortThem =  (people, places) => {
  //pretty sure I did a toy problem like what this winds up as if I control as mentioned in constraints

  //do inside a map?
  let remaining = places.slice(); //want new remaining each time funtion called so let

  //randomly select place for each person with place pool shrinking
  let results = people.map((person) => {

    let randomInd = Math.floor(Math.random() * remaining.length);

    let randomPlace = remaining[randomInd];// this is the part that will need research for better than math.random
    remaining.splice(randomInd, 1)

    return [person, randomPlace];

  });

  return results;
}

//test

console.log(sortThem([1,2,3], [4,5,6]))