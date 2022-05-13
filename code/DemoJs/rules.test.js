const {helloWorld, isValid, anotherValidation, looping, logical, getFirst} = require('./rules.js');

test('helloWorld', () => {
   expect(helloWorld()).toBe('Hello World');
});


describe('isValid', () => {
   
   // Include each line one by one, run stryker and see how it changes the outcome.
   it.each([
      [null, false],
      // [undefined, false],
      // ['', false],
      // ['validinput', true],
      // ['0123456789', true],
      // ['01234567891', false],
   ])('when given %p returns %p', (input, expected) => {
      expect(isValid(input)).toEqual(expected);
   });
});

describe('anotherValidation', () => {
   
   // Include each line one by one, run stryker and see how it changes the outcome.
   it.each([
      [5, 5, true],
      // [15, 5, true],
      // [2, 5, true],
      // [20, 2, true],
      // [5, 4, true],
      // [1, 1, false],
   ])('when given (%p, %p) returns %p', (a, b, expected) => {
      expect(anotherValidation(a, b)).toEqual(expected);
   });
});

describe('looping', () => {
   test('when given 5 returns 5', () => {
      expect(looping(5)).toEqual(5);
   });
});

describe('logical', () => {
   // Include each line one by one, run stryker and see how it changes the outcome.
   it.each([
      [true, true, true],
      // [true, false, true],
      // [false, true, true],
      // [false, false, false],
   ])('when given (%p, %p) returns %p', (b1, b2, expected) => {
      expect(logical(b1, b2)).toEqual(expected);
   });
});

describe('getFirst', () => {
   // Include each line one by one, run stryker and see how it changes the outcome.
   it.each([
      [[1], 1],
      // [[1, 2, 3], 1],
      // [[99, 2, 3], 99],
   ])('when given (%p) returns %p', (numbers, expected) => {
      expect(getFirst(numbers)).toEqual(expected);
   });
});
