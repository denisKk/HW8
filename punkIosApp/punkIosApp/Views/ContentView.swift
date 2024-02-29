import SwiftUI
import shared

struct ContentView: View {
	
    @ObservedObject private var viewModel: ContentViewModel = .init()

	var body: some View {
        NavigationStack {
            ScrollView {
                LazyVStack {
                    ForEach(viewModel.beers, id: \.id){ beer in
                        BeerCeelView(beer: beer)
                    }
                }
            }
            .navigationTitle("Beers")
        }
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
