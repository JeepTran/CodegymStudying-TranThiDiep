import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(private httpClient: HttpClient) {
  }


  // getEmployees() {
  //   const username = 'javainuse';
  //   const password = 'password';
  //
  //   const headers = new HttpHeaders({Authorization: sessionStorage.getItem('token')});
  //   console.log(headers);
  //   return this.httpClient.get<Employee[]>('http://localhost:8080/employees', {headers});
  // }
  //
  // public deleteEmployee(employee) {
  //   const username = 'javainuse';
  //   const password = 'password';
  //
  //   const headers = new HttpHeaders({Authorization: 'Basic ' + btoa(username + ':' + password)});
  //   return this.httpClient.delete<Employee>('http://localhost:8080/employees' + '/' + employee.empId, {headers});
  // }
  //
  // public createEmployee(employee) {
  //   const username = 'javainuse';
  //   const password = 'password';
  //
  //   const headers = new HttpHeaders({Authorization: 'Basic ' + btoa(username + ':' + password)});
  //   return this.httpClient.post<Employee>('http://localhost:8080/employees', employee, {headers});
  // }
}
