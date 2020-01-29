import { Component, OnInit } from '@angular/core';
import { ConvertstrService } from '../services/convertstr.service';

@Component({
  selector: 'app-one',
  templateUrl: './one.component.html',
  styleUrls: ['./one.component.css']
})
export class OneComponent implements OnInit {
  upperName:string;
  constructor(public convertstrService :ConvertstrService) {

   }
   fun(txt :HTMLInputElement){
     this.upperName=this.convertstrService.convertToUpper(txt.value);
   }

  ngOnInit() {
  }

}
