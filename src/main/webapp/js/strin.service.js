(function() {
	'use strict';
	
	/**
	 * Service
	 */
	angular.module('myNew').service('StrinService', function() {
		console.log('StrinService');
		var service = {};
		
		service.emri = "Jona";
		
		service.getFirstNumber = function(vektori) {
			return vektori[0];
		};
		
		service.tegjitha = {
				emri: 'Jona',
				mbiemri: 'Avdulaj',
				mosha: 28,
				merrGermenEPare: function(x) {
					return x[0];
				}
		};
		
		return service;
	});
})();
