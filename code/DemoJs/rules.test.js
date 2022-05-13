import assert from 'assert';
import {helloWorld, isValid, anotherValidation, looping, logical, getFirst} from './rules.js';
// const assert = require('assert');
// const rules = require('./rules.js');

describe('rules', () => {
   describe('initialize', () => {
      it('should return hello world', () => {
         assert.equal(helloWorld(), 'Hello World');
      });
   });

   describe('isValid', () => {   
      it('should return false if no string is passed', () => {
         assert.equal(isValid(), false);
      });
   });
});