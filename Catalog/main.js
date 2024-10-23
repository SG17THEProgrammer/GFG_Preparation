const fs = require('fs');

// Step 1: Read the JSON input from a file
function readInput(filename) {
    const data = fs.readFileSync(filename, 'utf-8');
    return JSON.parse(data);
}

// Step 2: Decode the Y values based on their base
function decodeValue(base, value) {
    return parseInt(value, base);
}

// Step 3: Lagrange Interpolation to find the constant term (c)
function lagrangeInterpolation(points) {
    const n = points.length;
    let constantTerm = 0;

    // Calculate the Lagrange basis polynomials and sum them up
    for (let i = 0; i < n; i++) {
        let xi = points[i].x;
        let yi = points[i].y;

        // Lagrange basis polynomial
        let li = 1;
        for (let j = 0; j < n; j++) {
            if (i !== j) {
                let xj = points[j].x;
                li *= (0 - xj) / (xi - xj);
            }
        }

        // Sum up the terms to get the constant term (c)
        constantTerm += li * yi;
    }

    // Round the result to avoid floating-point precision issues
    return Math.round(constantTerm);
}

// Main function
function findSecret(filename) {
    // Read input from the JSON file
    const input = readInput(filename);

    const n = input.keys.n;
    const k = input.keys.k;

    // Step 2: Decode the roots and store them in an array
    let points = [];
    for (let i = 1; i <= n; i++) {
        if (input[i]) {
            const x = parseInt(i); // key of the root
            const base = parseInt(input[i].base);
            const yValue = input[i].value;
            const y = decodeValue(base, yValue); // Decode the y value
            points.push({ x, y });
        }
    }

    // Check if we have enough points to solve for the polynomial
    if (points.length < k) {
        throw new Error('Not enough points to solve for the polynomial');
    }

    // Step 3: Find the constant term (c) using Lagrange Interpolation
    const secret = lagrangeInterpolation(points);
    console.log('The secret (constant term c) is:', secret);
}

// Call the main function with the input file
// findSecret('input.json');
findSecret('input1.json');
