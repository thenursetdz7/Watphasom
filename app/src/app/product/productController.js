(function () {
  'use strict';

  angular
    .module('app')
    .controller('listProductController', listProductController)
    .controller('addProductController', addProductController);


  /** @ngInject */
  function listProductController( $http,$scope,$rootScope, productService, $route) {
    var vm = this;
    productService.query(function (data) {
      vm.products = data;
    })

      vm.delete=function (id) {
        vm.productDelete = productService.delete(id).then(function(){
          $route.reload();
        })
      }
  }
  /** @ngInject */
  function addProductController( $http,$scope,$rootScope, productService, $route,$location) {
    var vm = this;
      vm.addProduct = function(){
        productService.save(vm.product).then(function(){
          $location.path("/")
        })
      }


  }

})();
