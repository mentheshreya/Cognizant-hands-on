DECLARE
BEGIN
    FOR rec IN (
        SELECT CustomerID, LoanID, DueDate
        FROM Loans
        WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Customer '
            || rec.CustomerID
            || ' has Loan '
            || rec.LoanID
            || ' due on '
            || rec.DueDate
        );
    END LOOP;
END;
/