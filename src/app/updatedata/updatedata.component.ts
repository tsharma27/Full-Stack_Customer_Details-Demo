import { Component , OnInit} from '@angular/core';
import { CustService } from '../cust.service';


@Component({
  selector: 'app-updatedata',
  templateUrl: './updatedata.component.html',
  styleUrls: ['./updatedata.component.css']
})
export class UpdatedataComponent {

  constructor(private s1:CustService){}

  ngOnit():void{}

  updatecustdata(updateform:{value:any;}){
    return this.s1.updateservice(updateform.value).subscribe();
  }

}
