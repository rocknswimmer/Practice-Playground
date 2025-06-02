var inputs = readline().split(' ');
const lightX = parseInt(inputs[0]); // the X position of the light of power
const lightY = parseInt(inputs[1]); // the Y position of the light of power
const initialTx = parseInt(inputs[2]); // Thor's starting X position
const initialTy = parseInt(inputs[3]); // Thor's starting Y position
let currentX = initialTx;
let currentY = initialTy;
// game loop
while (true) {
    const remainingTurns = parseInt(readline()); // The remaining amount of turns Thor can move. Do not remove this line.
    let move ='not set';
    // Write an action using console.log()
    // To debug: console.error('Debug messages...');
    if(currentX !== lightX && currentY != lightY){
        if(currentX > lightX && currentY > lightY){
            move = 'NW';
            currentX--;
            currentY--;
        } else if(currentX > lightX && currentY < lightY){
            move = 'SW';
            currentX--;
            currentY++;
        } else if(currentX < lightX && currentY > lightY){
            move = 'NE';
            currentX++;
            currentY--;
        } else if(currentX < lightX && currentY < lightY){
            move = 'SE';
            currentX++;
            currentY++;
            //console.error(currentX, currentY, lightX, lightY); copy paste error
        } else {
            console.error('Messed up according to neither equals')
        }
    } else if(currentX !== lightX){
        if(currentX > lightX){
            move = 'W';
            currentX--;
        } else if(currentX < lightX){
            move = 'E';
            currentX++;
        } else {
            console.error("mess up noted by X not equal")
        }
    } else if(currentY !== lightY){
        if(currentY > lightY){
            move = 'N';
            currentY--;
        } else if(currentY < lightY){
            move = 'S';
            currentY++;
        } else {
            console.error("mess up noted by Y not equal")
        }
    } else {
        console.error("some how no conditions met")
    }


    // A single line providing the move to be made: N NE E SE S SW W or NW
    console.log(move);
}
