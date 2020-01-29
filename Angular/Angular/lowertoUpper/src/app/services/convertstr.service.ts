import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ConvertstrService {

  constructor() { }
  convertToUpper(str : string):string{
     return str.toUpperCase();
  }
}
