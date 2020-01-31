import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'blank'
})
export class BlankPipe implements PipeTransform {
  

  transform(value: any): string {
    if (value=="") {
      return "No data Available";
    }
    else
    {
      return value;
    }
      
}
}
