import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent  {
  value1:number;
  value2:number;
  result:number;

  readdata(value1:HTMLInputElement,value2:HTMLInputElement,result:HTMLInputElement) {
    this.value1=parseInt(value1.value);
    this.value2=parseInt(value2.value);
    this.result=parseInt(result.value);
  }
  add() {
    this.result=this.value1+this.value2;
  }
  sub() {
    this.result=this.value1-this.value2;
  }
  mul(){
    this.result=this.value1*this.value2;
  }
  div() {
    this.result=this.value1/this.value2;
  }
}
