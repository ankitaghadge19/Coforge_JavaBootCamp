import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { UserModel } from '../Model/user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private apiURL = 'http://localhost:3000/users'
  constructor(private http: HttpClient) { }

  // http = inject(HttpClient);

  getUsers() :Observable<UserModel[]>{
    return this.http.get<UserModel[]>(this.apiURL)
  }

  addUser(user : UserModel) :Observable<UserModel>{
    return this.http.post<UserModel>(this.apiURL, user);
  }

  updateUser(user : UserModel) :Observable<UserModel>{
    return this.http.put<UserModel>(`${this.apiURL}/${user.id}`, user);
  }

  deleteUser(id : number) :Observable<void>{
    return this.http.delete<void>(`${this.apiURL}/${id}`);
  }
}
