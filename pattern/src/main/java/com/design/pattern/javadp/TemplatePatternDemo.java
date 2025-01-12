package com.design.pattern.javadp;

//•	Explanation: The template method defines the skeleton of an algorithm in the superclass, but allows subclasses
// to override specific steps without changing the algorithm's structure.

class TemplatePatternDemo {
    public static void main(String[] args) {
        DocumentTemplate htmlTemplate = new HtmlDocument();
        DocTemplate docTemplate = new DocTemplate(htmlTemplate);
        docTemplate.process();

        DocumentTemplate pdfTemplate = new PdfDocument();
        DocTemplate docTemplateB = new DocTemplate(htmlTemplate);
        docTemplate.process();

    }
}

class DocTemplate {
    DocumentTemplate documentTemplate;
    public DocTemplate(DocumentTemplate documentTemplate) {
        this.documentTemplate = documentTemplate;
    }
    public void process() {
        documentTemplate.loadDocument();
        documentTemplate.formatDocument();
        documentTemplate.printDocument();
    }
}

abstract class DocumentTemplate {
    void loadDocument(){
        System.out.println("Load Document");
    }
    abstract void formatDocument();
    abstract void printDocument();
}
class PdfDocument extends DocumentTemplate {

    @Override
    void formatDocument() {
        System.out.println("Format PDF Document");
    }

    @Override
    void printDocument() {
        System.out.println("Print PDF Document");
    }
}
class HtmlDocument extends DocumentTemplate {

    @Override
    void formatDocument() {
        System.out.println("Format HTML Document");
    }

    @Override
    void printDocument() {
        System.out.println("Print HTML Document");
    }
}
