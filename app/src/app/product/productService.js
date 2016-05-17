(function() {
  'use strict'
  angular
    .module('app')
    .factory('productService', productService)


  /** @ngInject */
  function productService($resource) {
    return $resource('http://localhost:8080/product/:id', {id: '@_id'}, {
      update: {
        method: 'PUT' // this method issues a PUT request
      }
    });

  }
})();
