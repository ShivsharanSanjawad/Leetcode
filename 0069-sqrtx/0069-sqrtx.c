

int mySqrt(int A) {
    if (A == 0) {
        return 0;
    }

    double epsilon = 0.00001;
    double x0 = A; // Initial guess
    double x1;

    // Iterate until convergence or maximum iterations
    while (1) {
        x1 = 0.5 * (x0 + A / x0); // Newton-Raphson formula

        // Check for convergence
        if (fabs(x1 * x1 - A) < epsilon) {
            break;
        }

        x0 = x1; // Update the guess
    }

    return (int)floor(x1);
}

