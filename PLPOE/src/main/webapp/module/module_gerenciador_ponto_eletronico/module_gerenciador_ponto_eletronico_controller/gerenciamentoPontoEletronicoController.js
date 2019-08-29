var gerenciadorPontoEletronicoModelModule = angular.module("gerenciadorPontoEletronicoModelModule", []);

gerenciadorPontoEletronicoModelModule.controller("gerenciadorPontoEletronicoModelController", function($scope, $http) {
	
	$scope.moduleName = "Registro de Ponto Eletrônico";
	
	$scope.gerenciadorPontoEletronicoModel = {};
	
	function incializador() { };
	
	$scope.save = function(gerenciadorPontoEletronicoModel) {
		console.log(gerenciadorPontoEletronicoModel);
		$http.get("http://localhost:8080/PLPOE-1.0.0.1-SNAPSHOT/rest/pontoEletronicoResource");
	}
	
});