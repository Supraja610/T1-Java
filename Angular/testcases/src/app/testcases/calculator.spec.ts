import { Calculator } from "./calculator"


describe("Testing function calc1 of Calculator", ()=>{

    beforeAll(()=>{
        // will execute once before the test cases are executed in a test suite
    }) 

    beforeEach(()=>{
        // will execute before each test in a test suite
    })

    
    
    afterAll(()=>{
         // will execute once after all the test cases are executed in a test suite
    })
    
    afterEach(()=>{
        // will execute after each test in a test suite
    })

    
    // it('Testing calc1 for negative values', ()=>{    
        
    //     let calc = new Calculator();
    //     let response = calc.calc1(-5);
       
    //     expect(response).toBe(0);
    // })

    // it('Testing calc1 for positive values', ()=>{
    //     let calc = new Calculator();
    //     let response = calc.calc1(5);
      
    //     expect(response).toBe(6);
    // })
})
    describe("Testing function calc2 of Calculator", ()=>{

        it('Testing calc1 for negative values', ()=>{    
           
            let calc = new Calculator();
            let response = calc.calc2(-25);
            
            expect(response).toBe(0);
        })
    
        it('Testing calc1 for positive values', ()=>{
            let calc = new Calculator();
            let response = calc.calc2(25);
           
            expect(response).toBe(5);
        })

        it('Testing calc1 for null values', ()=>{
            let calc = new Calculator();
            let response = calc.calc2(0);
           
            expect(response).toBe(0);
        })
})