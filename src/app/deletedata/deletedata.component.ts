import { Component , OnInit} from '@angular/core';
import { CustService } from '../cust.service';

@Component({
  selector: 'app-deletedata',
  templateUrl: './deletedata.component.html',
  styleUrls: ['./deletedata.component.css']
})
export class DeletedataComponent {

  constructor(private s1:CustService){}

  ngOnit():void{}

  deletecustdata(deleteform:{value:any;}){
    return this.s1.deleteservice(deleteform.value).subscribe();
  }

}
