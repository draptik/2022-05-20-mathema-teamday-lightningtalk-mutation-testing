const assert = require('assert');
const {helloWorld, isValid, anotherValidation, looping, logical, getFirst} = require('./rules.js');

test('helloWorld', () => {
   expect(helloWorld()).toBe('Hello World');
});
