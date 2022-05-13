import assert from 'assert';
import rules from './rules.js';

describe('rules', () => {
   describe('initialize', () => {
      it('should return hello world', () => {
         assert.equal(rules.init(), 'Hello World');
      });
   });
});