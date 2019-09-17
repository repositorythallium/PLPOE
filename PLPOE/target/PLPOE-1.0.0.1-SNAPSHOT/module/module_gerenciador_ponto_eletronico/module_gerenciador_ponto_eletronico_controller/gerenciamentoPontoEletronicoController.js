var gerenciadorPontoEletronicoModule = angular.module("gerenciadorPontoEletronicoModule", []);

gerenciadorPontoEletronicoModule.controller("gerenciadorPontoEletronicoController", function($scope, $http) {
	
	$scope.moduleName = "Registro de Ponto Eletrônico";
	
	$scope.gerenciadorPontoEletronicoModel = {};
	
	function incializador() { };
	
	// Save
	$scope.save = function(gerenciadorPontoEletronicoModel) {
		console.log(gerenciadorPontoEletronicoModel);
		$http.get("");
		delete $scope.gerenciadorPontoEletronicoModel;
	};
	
});