const {helloWorld, isValid, anotherValidation, looping, logical, getFirst} = require('./rules.js');

test('helloWorld', () => {
   expect(helloWorld()).toBe('Hello World');
});


describe('isValid', () => {
   
   it.each([
      [null, false],
      [undefined, false],
      ['', false],
      ['validinput', true],
      ['0123456789', true],
      ['01234567891', false],
   ])('when given %p returns %p', (input, expected) => {
      expect(isValid(input)).toEqual(expected);
   });

});