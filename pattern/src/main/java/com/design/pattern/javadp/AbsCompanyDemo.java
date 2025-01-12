package com.design.pattern.javadp;

class CompanyDemo {
    public static void main(String[] args) {
        Burger component = new AsiMonitor();
        component.prepare();
        Burger component2 = new AsiGpu();
        component2.prepare();
        Burger component3 = new MsiGpu();
        component3.prepare();
        Burger component4 = new MsiMonitor();
        component4.prepare();
    }
}

abstract class AbsCompanyDemo {
    abstract Burger createMonitor();
    abstract Burger createGpu();
}

interface Component {
    void assemble();
}

class MsiMonitor implements Burger {
    @Override
    public void prepare() {
        System.out.println("MsiMonitor");
    }
}

class MsiGpu implements Burger {
    @Override
    public void prepare() {
        System.out.println("MsiGpu");
    }
}

class AsiMonitor implements Burger {
    @Override
    public void prepare() {
        System.out.println("AsiMonitor");
    }
}

class AsiGpu implements Burger {
    @Override
    public void prepare() {
        System.out.println("AsiGpu");
    }
}

class AsiCompany extends AbsCompanyDemo {

    @Override
    Burger createMonitor() {
        return new AsiMonitor();
    }

    @Override
    Burger createGpu() {
        return new AsiGpu();
    }
}

class MsiCompany extends AbsCompanyDemo {

    @Override
    Burger createMonitor() {
        return new MsiMonitor();
    }

    @Override
    Burger createGpu() {
        return new MsiGpu();
    }
}