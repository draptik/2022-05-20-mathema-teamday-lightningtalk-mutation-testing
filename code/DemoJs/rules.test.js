// import assert from 'assert';
// import rules from './rules.js';
const assert = require('assert');
const rules = require('./rules.js');

describe('rules', () => {
   describe('initialize', () => {
      it('should return hello world', () => {
         assert.equal(rules.init(), 'Hello World');
      });
   });
});