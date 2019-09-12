/*
Template Name: Elite  admin
Author: Wrappixel
Email: niravjoshi87@gmail.com
File: js
*/
$(function() {
    "use strict";
      $(".tst1").click(function(){
           $.toast({
            heading: 'Welcome to Elite  admin',
            text: 'Use the predefined ones, or specify a custom position object.',
            position: 'top-right',
            loaderBg:'#ff6849',
            icon: 'info',
            hideAfter: 6000, 
            stack: 6
          });

     });

      $(".tst2").click(function(){
           $.toast({
            heading: 'Welcome to Elite  admin',
            text: 'Use the predefined ones, or specify a custom position object.',
            position: 'top-right',
            loaderBg:'#ff6849',
            icon: 'warning',
            hideAfter: 6500, 
            stack: 6
          });

     });
      $(".tst3").click(function(){
           $.toast({
            heading: 'Welcome to Elite  admin',
            text: 'Use the predefined ones, or specify a custom position object.',
            position: 'top-right',
            loaderBg:'#ff6849',
            icon: 'success',
            hideAfter: 6500, 
            stack: 6
          });

     });

      $(".tst4").click(function(){
           $.toast({
            heading: 'Welcome to Elite  admin',
            text: 'Use the predefined ones, or specify a custom position object.',
            position: 'top-right',
            loaderBg:'#ff6849',
            icon: 'error',
            hideAfter: 6500
            
          });

     });
});
          
