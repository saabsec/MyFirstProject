(function() {
	'use strict';
	
	angular.module('myNew', [ 'ngRoute' ]).controller('MainCtrl',
			(function($scope) {
				console.log('MainCtrl');
				
				$scope.shfaqtekst = false;
				
				$scope.aktivizotekst = function() {
					if (!$scope.shfaqtekst) {
						$scope.shfaqtekst = true;
					} else {
						$scope.shfaqtekst = false;
					}
				};
				
			}));
	
})();
