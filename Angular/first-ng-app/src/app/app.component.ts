import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { UserProfileComponent } from './components/user-profile/user-profile.component';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, UserProfileComponent, CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  users = [
    {name:"Sam", isSingle: true, salary: 10000},
    {name:"James", isSingle: false, salary: 50000},
    {name:"Edward", isSingle: true, salary: 20000},
  ]

  receivedData(e:String){
    console.log(e);
  }
}
