import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  welcomeHeading = 'Welcome to Student Course Portal';
  welcomeDescription = 'Manage your academic journey, explore available courses, track your enrollment status, and monitor overall performance with real-time analytics.';
  
  // Hardcoded statistics required for Hands-On 1 Task 2
  coursesAvailable = 12;
  coursesEnrolled = 3;
  gpa = 3.8;
}
