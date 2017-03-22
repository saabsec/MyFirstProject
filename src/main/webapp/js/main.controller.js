(function() {
	'use strict';
	
	angular.module('myNew').controller('MainCtrl', function(StrinService) {
		console.log('MainCtrl');
		var x = [2, 3, 1, 4];
		
		var elementiPare = StrinService.getFirstNumber(x);
		console.log(elementiPare);
		
		console.log(StrinService.tegjitha.merrGermenEPare(x));
		
	});
	
})();
