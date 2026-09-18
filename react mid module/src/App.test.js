import { fireEvent, render, screen } from '@testing-library/react';
import App from './App';

test('displays and updates the user name', () => {
  render(<App />);
  const input = screen.getByLabelText(/update your name/i);

  expect(screen.getByRole('heading', { name: 'John Doe' })).toBeInTheDocument();

  fireEvent.change(input, { target: { value: 'Ada Lovelace' } });

  expect(screen.getByRole('heading', { name: 'Ada Lovelace' })).toBeInTheDocument();
});
