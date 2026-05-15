import { PreloadAllModules, RouterModule, Routes } from '@angular/router';

import { AuthGuard } from '../guards/auth.guard';
import { NgModule } from '@angular/core';

const routes: Routes = [
  { path: '', redirectTo: 'login', pathMatch: 'full' },
  {
    path: 'login',
    loadChildren: () => import('../pages/login/login.module').then( m => m.LoginPageModule)
  },
  {
    path: 'home',
    loadChildren: () => import('../pages/home/home.module').then( m => m.HomePageModule),
    canActivate: [AuthGuard]
  },
  {
    path: 'em-curso',
    loadChildren: () => import('../pages/em-curso/em-curso.module').then( m => m.EmCursoPageModule),
    canActivate: [AuthGuard]
  },
  {
    path: 'avaliacoes',
    loadChildren: () => import('../pages/avaliacoes/avaliacoes.module').then( m => m.AvaliacoesPageModule),
    canActivate: [AuthGuard]
  },
  {
    path: 'grade',
    loadChildren: () => import('../pages/grade/grade.module').then( m => m.GradePageModule),
    canActivate: [AuthGuard]
  },
  {
    path: 'util',
    loadChildren: () => import('../pages/utils/utils.module').then( m => m.UtilsPageModule),
    canActivate: [AuthGuard]
  },
  {
    path: 'eventos',
    loadChildren: () => import('../pages/eventos/eventos.module').then( m => m.EventosPageModule),
    canActivate: [AuthGuard]
  }];
@NgModule({
  imports: [RouterModule.forRoot(routes, { preloadingStrategy: PreloadAllModules })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
