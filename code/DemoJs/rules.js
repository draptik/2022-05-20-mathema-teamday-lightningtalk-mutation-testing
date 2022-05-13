
function helloWorld() {
    return "Hello World";
}

function isValid(s) {
    if (!s) {
        return false;
    }

    if (s.length > 30) {
        return false;
    } else {
        return true;
    }
}

function anotherValidation(a, b) {
    if (a + b == 10) return true;
    if (a - b == 10) return true;
    if (a * b == 10) return true;
    if (a / b == 10) return true;
    if (a % b == 1) return true;
}

function looping(a)
{
    let result = 0;
    for (const i = 0; i < a; i++)
    {
        result++;
    }
    return result;
}

function logical(b1, b2)
{
    if (b1 && b2) return true;
    if (b1 || b2) return true;
    return false;
}

function getFirst(numbers) {
    return numbers[0];
}

export { helloWorld, isValid, anotherValidation, looping, logical, getFirst };