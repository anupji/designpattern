package com.design.pattern.javadp;

//•	Explanation: The template method defines the skeleton of an algorithm in the superclass, but allows subclasses
// to override specific steps without changing the algorithm's structure.

class TempDpDemo {
    public static void main(String[] args) {
        // Create a PDF document
        DocumentGenerator pdfGenerator = new PDFGenerator();
        pdfGenerator.generateDocument();

        System.out.println();

        // Create an HTML document
        DocumentGenerator htmlGenerator = new HTMLGenerator();
        htmlGenerator.generateDocument();
    }
}
// Abstract class defining the template method
abstract class DocumentGenerator {
    // Template method (final to prevent overriding)
    public final void generateDocument() {
        fetchData();
        formatContent();
        printDocument();
    }

    // Common step
    protected void fetchData() {
        System.out.println("Fetching data...");
    }

    // Steps to be implemented by subclasses
    protected abstract void formatContent();
    protected abstract void printDocument();
}

// Subclass implementing HTML-specific steps
class HTMLGenerator extends DocumentGenerator {
    @Override
    protected void formatContent() {
        System.out.println("Formatting content for HTML...");
    }

    @Override
    protected void printDocument() {
        System.out.println("Displaying HTML document in browser...");
    }
}


// Subclass implementing PDF-specific steps
class PDFGenerator extends DocumentGenerator {
    @Override
    protected void formatContent() {
        System.out.println("Formatting content for PDF...");
    }

    @Override
    protected void printDocument() {
        System.out.println("Printing PDF document...");
    }
}



