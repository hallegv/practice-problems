// we can iterate w two pointers from front and back 
var isPalindrome = function(s) {
    // to get only alphanumeric chars & ignore case
    s = s.replace(/[^0-9a-z]/gi,'').toLowerCase();
    for (let i = 0; i < s.length/2; i++) {
        if (s[i] !== s[s.length - i - 1]) {
            return false;
        }
    }
    return true;
};

// or we can just use some fun JS helpers and check if the reverse equals the original...
var isPalindrome = function(s) {
    // to get only alphanumeric chars & ignore case
    s = s.replace(/[^0-9a-z]/gi,'').toLowerCase();
    return s === (s.split("").reverse().join(""));
};
