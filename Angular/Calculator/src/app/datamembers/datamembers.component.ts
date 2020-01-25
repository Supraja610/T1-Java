import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-datamembers',
  templateUrl: './datamembers.component.html',
  styleUrls: ['./datamembers.component.css']
})
export class DatamembersComponent {

name :string;
age :number;
email:string;

  constructor() 
  {
    this.name ="abc";
    this.age=15;
    this.email="abc@gmail.com"
  }
  changeval() {
    this.name="vbn";
    this.age=22;
    this.email="vbn@email.com"
    
  }
}   
  
 